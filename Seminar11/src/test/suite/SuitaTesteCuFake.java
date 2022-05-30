package test.suite;

import clase.AgentieTurism;
import clase.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TestAgentieTurism;
import test.TestPachetTuristic;
import test.categorii.ITesteCuFake;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieTurism.class, TestPachetTuristic.class})
@Categories.IncludeCategory(ITesteCuFake.class)
public class SuitaTesteCuFake {

}
