package org.akinosoft.akinoexplorer;

import java.io.File;

public class FileNode {

    private File file;

    public FileNode(File fileRoot) {
        this.file = fileRoot;
    }

    @Override
    public String toString() {
        String name = file.getName();
        if (name.equals("")) {
            return file.getAbsolutePath();
        } else {
            return name;
        }
    }
}
