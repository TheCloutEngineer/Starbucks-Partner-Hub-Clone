package com.schedule.BaristaBoard.Model;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdministratorTest {
    @Test
    public void testGetterSetter() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(Administrator.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

}