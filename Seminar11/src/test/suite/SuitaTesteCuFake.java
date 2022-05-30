package test.suite;

import clase.AgentieTurism;
import clase.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TestAgentieTurism;
import test.TestPachetTuristic;
import test.categorii.ITesteBoundary;
import test.categorii.ITesteCuFake;
import test.categorii.ITestePoateRezerva;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieTurism.class, TestPachetTuristic.class})
@Categories.IncludeCategory(ITesteCuFake.class)
@Categories.ExcludeCategory({ITesteBoundary.class, ITestePoateRezerva.class})
public class SuitaTesteCuFake {

}
