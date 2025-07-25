package day5.Assignment.multilevelinheritance.texteditor;

public class Wordpad extends Notepad {
    private boolean isBold;

    public Wordpad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}