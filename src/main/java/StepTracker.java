import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 Private int activedays, totaldays;
 Private int minsteps, totalsteps;
 Public Steptracker( int goal){
  minsteps = goals;
  totalsteps = 0;
  activedays =0;
  totaldays =0;
 }
 Public void addDailysteps(int steps){
  totalsteps += steps;
  totaldays++;
  if( steps >= minsteps){
     activedays++;
  }
 }
 Public int activeDays(){
 return activedays;
 }
 Public double averageSteps(){
  if( totalsteps == 0){
    return 0.0;
  }
  return (double)totalsteps / totaldays;
 }
} 
