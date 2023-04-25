package Homework_3.base.abstractClasses;

import Homework_3.base.classes.workWithFile.CFileCreator;
import Homework_3.base.classes.workWithFile.CFindTheSameFileName;
import Homework_3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}