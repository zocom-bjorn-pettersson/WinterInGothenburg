public class Main {
    public static void main(String[] args) {
        System.out.println("WinterInGothenburg!");
    }


    class Träd {

        //Vad har träd för attributer?

        public String tree;     //Type of trees
        public String branches;
        public String leaves;
        public String roots;
        public String stem;
        public String shapeOfCrown;
        public int treeAge


        //Konstruktorn

        public Träd(String tree, String branches, Strig leaves, String roots, String stem, int treeAge) {

            this.tree = tree;
            this.branches = branches;
            this.leaves = leaves;
            this.roots = roots;
            this.stem = stem;
            this.treeAge = treeAge;
        }


        //Methods

        public static void treesThatDontKeepTheirLeaves() {
            System.out.println("Every autumn some of the trees lose their leaves");
        }

        public static void treesThatKeepTheirLeaves() {
            System.out.println("Trees that keep their leaves all year around.");
        }

    }

}

)
}
}
