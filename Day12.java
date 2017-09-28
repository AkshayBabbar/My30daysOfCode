class Student extends Person{
	private int[] testScores;
        Student(String firstName, String secondName, int identification,int[] Scores){
                super(firstName,secondName,identification);
                this.testScores = Scores;
        }
       
        public char calculate()
        {
                int i=0;
                int average = 0;
                while(i<testScores.length)
                {
                        average = testScores[i] + average;
                        i++;
                }
                average = average / testScores.length;
            
                if(average>= 90)
                         return 'O';
                if(average>= 80 && average <90 )
                         return 'E';
                if(average>= 70 && average <80 )
                         return 'A';
                 if(average>= 55 && average <70 )
                         return 'P';
                 if(average>= 40 && average <55 )
                         return 'D';
                 else
                         return 'T';
        }
}
