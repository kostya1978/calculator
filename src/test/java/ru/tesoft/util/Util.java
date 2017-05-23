package ru.tesoft.util;

import java.io.File;

/**
 * Created by nikolaevk on 5/23/2017.
 */
public class Util {
  public static String getCurrentProjectPath() {
    String myProjectPath = new File(".").getAbsolutePath().replaceAll(".$", "");

    if (myProjectPath.endsWith("/")) {
      myProjectPath = myProjectPath.substring(0, myProjectPath.length() - 1);
    }

    return myProjectPath;
  }
}
