package clase.interfete;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface IReader {

    public List<Aplicant> readAplicants(String file);
}
