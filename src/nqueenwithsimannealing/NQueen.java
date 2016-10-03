/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueenwithsimannealing;

/**
 *
 * @author Safat
 */
class NQueen
{
 private int boardSize;
 private State currentState, nextState;

 public NQueen(int boardSize)
 {
  this.boardSize = boardSize;
  currentState = new State(boardSize);
 }

 public void solve()
 {
  double temperature;
  double delta;
  double probability;
  double rand;

        for( temperature = 10000; temperature > 0 && (currentState.getCost()!= 0) ; temperature--)
        {
   nextState = currentState.getNextState();
   delta = currentState.getCost() - nextState.getCost();
   probability = Math.exp(delta / temperature);
   rand = Math.random();

   if(delta > 0)
   {
    currentState = nextState;
   }
   else if(rand <= probability)
   {
    currentState = nextState;
   }
  }
 }

    public void show()
    {
        int temp = 0;
        Queen q[] = currentState.getQueens();
        boolean queen = false;
        System.out.println();

  for (int i = 0; i < boardSize; i++) {
   for (int j = 0; j < boardSize; j++) {
    for (int k = 0; k < boardSize; k++) {
     if (i == q[k].getIndexOfX() && j == q[k].getIndexOfY()) {
      queen = true;
      temp = k;
      break;
     }
    }
    if (queen) {
     System.out.print("|"+temp);
     queen = false;
    }
    else {
     System.out.print("|_");
    }
   }
   System.out.println("|");
        }
    }
}

