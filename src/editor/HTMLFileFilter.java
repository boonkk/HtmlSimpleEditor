package editor;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        if(f.getName().toLowerCase().endsWith(".html") || f.getName().toLowerCase().endsWith(".htm") || f.isDirectory())
            return true;
        return false;
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files";
    }
}
