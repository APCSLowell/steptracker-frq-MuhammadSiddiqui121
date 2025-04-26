import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int activedays; 
 private int totaldays;
 private int minsteps;
 private int totalsteps;
 public StepTracker( int goal){
  minsteps = goal;
  totalsteps = 0;
  activedays =0;
  totaldays =0;
 }
 public void addDailySteps(int steps){
  totalsteps += steps;
  totaldays++;
  if( steps >= minsteps){
     activedays++;
  }
 }
 public int activeDays(){
 return activedays;
 }
 public double averageSteps(){
  if( totalsteps == 0){
    return 0.0;
  }
  return (double)totalsteps / totaldays;
 }
} 
