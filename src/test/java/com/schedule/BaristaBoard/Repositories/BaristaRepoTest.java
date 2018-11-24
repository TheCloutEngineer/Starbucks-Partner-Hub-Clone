package com.schedule.BaristaBoard.Repositories;

import com.schedule.BaristaBoard.Model.Barista;
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
public class BaristaRepoTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BaristaRepo baristaRepo;

    @Test
    public void should_find_no_baristas_if_repository_is_empty() {
        Iterable<Barista> baristas = baristaRepo.findAll();

        assertThat(baristas).isEmpty();
    }
    @Test
    public void should_store_barista() {
        Barista barista = baristaRepo.save(new Barista("Ryan", "DoubleC", "232@fg"));

        assertThat(barista).hasFieldOrPropertyWithValue("firstName", "Ryan");
        assertThat(barista).hasFieldOrPropertyWithValue("lastName", "DoubleC");
        assertThat(barista).hasFieldOrPropertyWithValue("password", "232@fg");


    }
    @Test
    public void should_delete_all_baristas() {
        entityManager.persist(new Barista("Clement", "Ojie","232@fg"));
        entityManager.persist(new Barista("Ryan", "DoubleC","232@fg" ));

        baristaRepo.deleteAll();

        assertThat(baristaRepo.findAll()).isEmpty();
    }

    @Test
    public void should_find_all_baristas() {
        Barista barista = new Barista("Clement", "Ojie","232@fg" );
        entityManager.persist(barista);

        Barista barista1 = new Barista("Ryan", "DoubleC", "232@fg");
        entityManager.persist(barista1);

        Barista barista2 = new Barista("Khalil", "Saboor", "232@fg");
        entityManager.persist(barista2);

        Iterable<Barista> managers = baristaRepo.findAll();

        assertThat(managers).hasSize(3).contains(barista, barista1, barista2);
    }

    @Test
    public void should_find_barista_by_lastName() {
        Barista barista1 = new Barista("Clement", "Ojie","232@fg");
        entityManager.persist(barista1);

        Barista barista2 = new Barista("Ryan", "DoubleC","232@fg");
        entityManager.persist(barista2);

        Barista foundManager = baristaRepo.findByLastName(barista2.getLastName());

        assertThat(foundManager).isEqualTo(barista2);
    }

}