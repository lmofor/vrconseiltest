/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvrconseil;

/**
 *
 * @author admin
 */
public class Tondeuse {
    private int x,y;
    private char orientation;

    public Tondeuse(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }
    
    
    
    public void pivoterGauche()
    {
        switch (this.orientation) {
            case 'N':
                this.orientation='W';
                break;
            case 'W':
                 this.orientation='S';
                break;
             case 'S':
                  this.orientation='E';
                break;
              case 'E':
                 this.orientation='N';
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void pivoterDroite()
    {
        switch (this.orientation) {
            case 'N':
                this.orientation='E';
                break;
            case 'E':
                 this.orientation='S';
                break;
             case 'S':
                  this.orientation='W';
                break;
              case 'W':
                 this.orientation='N';
                break;
            default:
                throw new AssertionError();
        }

    }
            
        public void avancer(int maxX,int maxY)
        {
            
        switch (this.orientation) {
            case 'N':
                if (this.y<maxY) {
                    this.y++;
                }
                break;
            case 'E':
                 if (this.x<maxX) {
                    this.x++;
                }
                break;
             case 'S':
                  if (this.y>0) {
                    this.y--;
                }
                break;
              case 'W':
                if (this.x>0) {
                    this.x--;
                }
                break;
            default:
                throw new AssertionError();
        }    
        }

    @Override
    public String toString() {
        return ""+this.x+ " " +this.y + " " + this.orientation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }
        
    public void simuler(String action,int maxX,int maxY)
    {
        for (int i = 0; i < action.length(); i++) {
            switch (action.charAt(i)) {
                case 'G':
                    this.pivoterGauche();
                    break;
                case 'D':
                    this.pivoterDroite();
                    break;
                  case 'A':
                    this.avancer(maxX,maxY);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
