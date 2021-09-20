[![Points badge](../../blob/badges/.github/badges/points.svg)](../../actions)

# Programming Checkpoint 1: Wildfire

## Programming Checkpoint Outcomes:

- Develop a Java class that uses recursion to simulate a wildfire

## Preparatory Readings:

- ZyBook Unit 3

## This Programming Checkpoint

In this programming checkpoint, you will be required to create a class which will simulate a wildfire.
The class can read a description of a map of cells where each cell can be either a Tree (**T**), Fire (**F**), or Water (**W**).
Starting a fire in a **T** cell would turn it to an **F** as well as spread the fire to the adjacent (top, down, right, and left) **T** cells.
The fire would stop spreading in a given direction when it encounters a **W** cell.

### Programming Checkpoint Requirements:

You are provided with a test suite in folder [src/test/java](src/test/java).
Your implementation must pass all tests provided in this test class.
The wildfire test suite is broken into four sets for grading purposes as well as to help you with incremental development.

1. Individual tests can be run as follows:
   1. `gradle test_basic`
   1. `gradle test_custom_map_creation`
   1. `gradle test_custom_map_start_fire`
   1. `gradle test_custom_map_start_fire_on_water`
1. Running all of these tests must be possible by running `gradle test`.

1. Your project should use recursion.

### Input format

The file [map.txt](map.txt) contains a description of the map of cells.
The first two rows of the text file contain the number of rows and columns of the map.
Each following line represents a row of cells.
Each cell contains either a tree (**T**), water (**W**) or a fire(**F**).
You can assume that the map file properly formatted.

### Submission Requirements:

1. All code must be added and committed to your local git repository.
1. All code must be pushed to the GitHub repository created when you "accepted" the assignment.
   1. After pushing, with `git push origin main`, visit the web URL of your repository to verify that your code is there.
      If you don't see the code there, then we can't see it either.
1. Your code must compile and run.
   The auto-grading tests will indicate your score for your submission.
   1. The auto-grading build should begin automatically when you push your code to GitHub.
   1. If your program will not compile, the graders will not be responsible for trying to test it.
   1. You should get an email regarding the status of your build, if it does not pass, keep trying.
1. Important: this is a two-week assignment. It's required that you pass at least **50%** of the test cases by the end of the first week.

## Important Notes:

- Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
- Projects must be received by the time specified on the due date. Projects received after that time will get a grade of zero.
- Please review the academic honesty policy.
  - Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty.
  - Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty.
  - All programs submitted will be reviewed for evidence of academic dishonesty, and all violations will be handled accordingly.

## Grading

- View on GitHub:
  1.  On your GitHub repo page, click the :arrow_forward: **Actions** tab to see your graded results.
  1.  If it isn't a green check mark (:heavy_check_mark:) then at least part of the testing failed.
  1.  Click the commit message for the failing version then click "Autograding" on the left side of the page.
  1.  Follow the :x: path and expand things to see what errors exist.
  1.  At the bottom of the _education/autograding_ section, you can view the score for the auto-grading portion of the rubric.
      It will look something like **_40/100_**.
