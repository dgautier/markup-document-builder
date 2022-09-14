package io.github.swagger2markup.markup.builder;

public class CheckboxItem {

    private String line;
    private Boolean checked;

    public CheckboxItem(String line, Boolean checked) {
        this.line = line;
        this.checked = checked;
    }

    public String getLine() {
        return line;
    }

    public Boolean isChecked() {
        return checked;
    }

}
