package day50.tasks.task1;

public class EXEFile implements ReadFile {

    @Override
    public String open() {
        return "open in WindowsOS .exe";
    }

    @Override
    public String read() {
        return "read in WindowsOS .exe";
    }

    @Override
    public String save() {
        return "save in WindowsOS .exe";
    }

    @Override
    public String close() {
        return "close in WindowsOS .exe";
    }
}
