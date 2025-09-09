/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Drew Sullivan
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		/**
		RevisedHistoricalEvent tulsaMassacreCopy = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
				tulsaRevised, tulsaCitation);

		System.out.println(tulsaMassacre.equals(tulsaMassacreCopy));
		 **/

		String discoveringAmericaDescription = "Columbus bravely proved the world was round and discovered America.";
		Date discoveringAmericaDay = new Date(10, 12, 1492);
		HistoricalEvent discoveringAmerica = new HistoricalEvent(discoveringAmericaDescription, discoveringAmericaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(discoveringAmerica);


		String discoveringAmericaRevised = "Educated Europeans already knew the Earth was round. Columbus never reached mainland North America; he landed in the Caribbean. Indigenous peoples had lived there for thousands of years. Also, Norse explorers like Leif Erikson reached North America around 1000 CE.",
				discoveringAmericaCitation = "https://americanindian.si.edu/nk360/informational/columbus-day-myths";
		RevisedHistoricalEvent americaDiscovered = new RevisedHistoricalEvent(discoveringAmericaDescription, discoveringAmericaDay,
				discoveringAmericaRevised, discoveringAmericaCitation);

		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		americaDiscovered.teach();
	}
}