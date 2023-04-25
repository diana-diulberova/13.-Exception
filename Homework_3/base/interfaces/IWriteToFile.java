package Homework_3.base.interfaces;

import Homework_3.base.exceptions.MyFileCreateException;
import Homework_3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}