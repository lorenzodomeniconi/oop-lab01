class TestComplexNumCalculator {
  public static void main(String[] args) {
    ComplexNum n1 = new ComplexNum();
    ComplexNum n2 = new ComplexNum();
    n1.build(1, 2);
    n2.build(2,3);
    ComplexNumCalculator calc = new ComplexNumCalculator();
    calc.build();
    System.out.println(calc.add(n1, n2));
    System.out.println(calc.sub(n1, n2));
    /*
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
  }
}
