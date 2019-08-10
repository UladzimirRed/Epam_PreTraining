package entity;

public enum BookType {
    PAPER_BOOK("Paper Book"), E_BOOK("eBook");
    private String type;

    BookType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
