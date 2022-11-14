class Student {
    String name = new String();
    String surname = new String();
    int matriculationYear, id;
    // È buona pratica mettere i campi in testa alla classe

    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Nome: "+name+"  Cognome: "+surname);
        System.out.println("Matricola: "+id+"  Anno d'immatricolazione: "+matriculationYear);
    }
}
