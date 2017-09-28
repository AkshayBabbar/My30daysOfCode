	// Add your code here
        public Difference(int []elements){
                this.elements = elements;
        }
        int max = 0;
        int min = 100;
        public void computeDifference(){
                int maximum = elements[0];
                int minimum = elements[0];
               for(int i = 0 ;i < elements.length; i++){
                  if(elements[i]>maximum){
                          maximum = elements[i];
                  }
                  if(elements[i]<minimum){
                          minimum = elements[i];
                  }
               }
                maximumDifference = maximum - minimum;
                //return maximumDifference;
        }
        
        
