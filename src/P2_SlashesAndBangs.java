/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-02-2018
*/

/*
!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!\\
\\\\!!!!!!!!!!!!!!\\\\
\\\\\\!!!!!!!!!!\\\\\\
\\\\\\\\!!!!!!\\\\\\\\
\\\\\\\\\\!!\\\\\\\\\\
 */

/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	
1                22 !
2								18 !, 4 \
3												  14 !, 8 \
4																  10 !, 12 \
5																				  6 !, 16 \
6																								  2 !, 20 \

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 				for(each of 6 lines){
					for(each of slash by 2 multiple ){
						draw "\" in multiple of 2
					}
					for(each of "!" reduce by 2 multiple){
						draw "!" by reduce multiple of 2
					}
					for(each of slash by 2 multiple ){
						draw "\" in multiple of 2
					}
				}
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for(int i =0 ; i<6 ; i++){
			for(int k =0; k<(i*2) ; k++ ){
				System.out.print("\\");
			}
			for(int j = (i*2); j<22-(i*2); j++){				
				System.out.print("!");
			}
			for(int k = 0; k<(i*2) ; k++ ){
				System.out.print("\\");
			}
			System.out.println();
		}
	}

}
