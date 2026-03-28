interface Exportable {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exported as JSON");
    }
}