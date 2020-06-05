package day50.tasks.task1;

public class TxtFile implements ReadFile {

    @Override
    public String open() {
        return "open with NotePad .txt";
    }

    @Override
    public String read() {
        return "read with NotePad .txt";
    }

    @Override
    public String save() {
        return "save with NotePad .txt";
    }

    @Override
    public String close() {
        return "close with NotePad .txt";
    }
}
