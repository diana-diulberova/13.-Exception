package Homework_3.base.interfaces;

import Homework_3.base.exceptions.FileCreateException;

//import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}