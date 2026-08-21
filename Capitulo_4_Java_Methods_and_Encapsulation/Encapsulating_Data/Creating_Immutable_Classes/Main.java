package Encapsulating_Data.Creating_Immutable_Classes;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("INITIAL");
        NotImmutable problem = new NotImmutable(sb);

        sb.append("added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append("more");

        System.out.println(problem.getBuilder()); // initial added more

        //
        /* 
            public class Mutable {
            private StringBuilder builder;

            public Mutable(StringBuilder b) {
                builder = new StringBuilder(b);
            }

            public StringBuilder getBuilder() {
                return new StringBuilder(builder);
            }
        }*/
    }
}
