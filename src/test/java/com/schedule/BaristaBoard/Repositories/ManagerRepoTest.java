package com.schedule.BaristaBoard.Repositories;

import com.schedule.BaristaBoard.Model.Manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class ManagerRepoTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private com.schedule.BaristaBoard.Repositories.ManagerRepo managerRepo;

    @Test
    public void should_find_no_managers_if_repository_is_empty() {
        Iterable<Manager> managers = managerRepo.findAll();

        assertThat(managers).isEmpty();
    }

    @Test
    public void should_store_manager() {
        Manager manager = managerRepo.save(new Manager("Clement", "Ojie", "232@fg"));

        assertThat(manager).hasFieldOrPropertyWithValue("firstName", "Clement");
        assertThat(manager).hasFieldOrPropertyWithValue("lastName", "Ojie");
        assertThat(manager).hasFieldOrPropertyWithValue("password", "232@fg");

    }

    @Test
    public void should_delete_all_manager() {
        entityManager.persist(new Manager("Clement", "Ojie","232@fg"));
        entityManager.persist(new Manager("Ryan", "DoubleC","232@fg" ));

        managerRepo.deleteAll();

        assertThat(managerRepo.findAll()).isEmpty();
    }

    @Test
    public void should_find_all_managers() {
        Manager manager1 = new Manager("Clement", "Ojie","232@fg" );
        entityManager.persist(manager1);

        Manager manager2 = new Manager("Ryan", "DoubleC", "232@fg");
        entityManager.persist(manager2);

        Manager manager3 = new Manager("Khalil", "Saboor", "232@fg");
        entityManager.persist(manager3);

        Iterable<Manager> managers = managerRepo.findAll();

        assertThat(managers).hasSize(3).contains(manager1, manager2, manager3);
    }

    @Test
    public void should_find_manager_by_lastName() {
        Manager manager1 = new Manager("Clement", "Ojie","232@fg");
        entityManager.persist(manager1);

        Manager manager2 = new Manager("Ryan", "DoubleC","232@fg");
        entityManager.persist(manager2);

        Manager foundManager = managerRepo.findByLastName(manager2.getLastName());

        assertThat(foundManager).isEqualTo(manager2);
    }

}