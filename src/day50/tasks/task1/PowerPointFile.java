package day50.tasks.task1;

public class PowerPointFile implements ReadFile {

    @Override
    public String open() {
        return "open with MS PowerPoint .pptx";
    }

    @Override
    public String read() {
        return "read with MS PowerPoint .pptx";
    }

    @Override
    public String save() {
        return "save with MS PowerPoint .pptx";
    }

    @Override
    public String close() {
        return "close with MS PowerPoint .pptx";
    }
}
