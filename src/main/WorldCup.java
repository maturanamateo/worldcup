package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WorldCup {
	 //Europe
	 Team Albania = new Team("Albania", Region.EU, 1368);
	 Team Andorra = new Team("Andorra", Region.EU, 1099);
	 Team Armenia = new Team("Armenia", Region.EU, 1206);
	 Team Austria = new Team("Austria", Region.EU, 1479);
	 Team Azerbaijan = new Team ("Azerbaijan", Region.EU, 1202);
	 Team Belarus = new Team("Belarus", Region.EU, 1301);
	 Team Belgium = new Team ("Belgium", Region.EU, 1737);
	 Team Bosnia_Herezgovina = new Team ("Bosnia and Herzegovina", Region.EU, 1478);
	 Team Bulgaria = new Team ("Bulgaria", Region.EU, 1419);
	 Team Croatia = new Team ("Croatia", Region.EU, 1621);
	 Team Cyprus = new Team ("Cyprus", Region.EU, 1276);
	 Team Czech_Republic = new Team ("Czech Republic", Region.EU, 1424);
	 Team Denmark = new Team ("Denmark", Region.EU, 1586);
	 Team England = new Team ("England", Region.EU, 1647);
	 Team Estonia = new Team ("Estonia", Region.EU, 1240);
	 Team Farce_Islands = new Team ("Faroe Islands", Region.EU, 1213);
	 Team Finland = new Team ("Finland", Region.EU, 1375);
	 Team France = new Team ("France", Region.EU, 1734);
	 Team Georgia = new Team("Georgia", Region.EU, 1256);
	 Team Germany = new Team("Germany", Region.EU, 1570);
	 Team Gibraltar = new Team ("Gibraltar", Region.EU, 900);
	 Team Greece = new Team ("Greece", Region.EU, 1433);
	 Team Hungary = new Team ("Hungary", Region.EU, 1419);
	 Team Iceland = new Team ("Iceland", Region.EU, 1450);
	 Team Israel = new Team ("Israel", Region.EU, 1285);
	 Team Italy = new Team ("Italy", Region.EU, 1550);
	 Team Kazakhstan = new Team ("Kazakhstan", Region.EU, 1171);
	 Team Kosovo = new Team ("Kosovo", Region.EU, 1124);
	 Team Latvia = new Team ("Latvia", Region.EU, 1101);
	 Team Liechtenstein = new Team ("Liechtenstein", Region.EU, 932);
	 Team Lithuania = new Team ("Lithuania", Region.EU, 1102);
	 Team Luxembourg = new Team ("Luxembourg", Region.EU, 1277);
	 Team Malta = new Team ("Malta", Region.EU, 943);
	 Team Moldova = new Team ("Moldova", Region.EU, 974);
	 Team Montenegro = new Team ("Montenegro", Region.EU, 1419);
	 Team Netherlands = new Team ("Netherlands", Region.EU, 1554);
	 Team Macedonia = new Team ("Macedonia", Region.EU, 1350);
	 Team Northern_Ireland = new Team ("Northern Ireland", Region.EU, 1481);
	 Team Norway = new Team ("Norway", Region.EU, 1420);
	 Team Poland = new Team ("Poland", Region.EU, 1535);
	 Team Portugal = new Team ("Portugal", Region.EU, 1607);
	 Team Republic_Ireland = new Team ("Republic of Ireland", Region.EU, 1484);
	 Team Romania = new Team ("Romania", Region.EU, 1496);
	 Team Russia = new Team ("Russia", Region.EU, 1425);
	 Team San_Marino = new Team ("San Marino", Region.EU, 840);
	 Team Scotland = new Team ("Scotland", Region.EU, 1430);
	 Team Serbia = new Team ("Serbia", Region.EU, 1484);
	 Team Slovakia = new Team ("Slovakia", Region.EU, 1482);
	 Team Slovenia = new Team ("Slovenia", Region.EU, 1366);
	 Team Spain = new Team ("Spain", Region.EU, 1601);
	 Team Sweden = new Team ("Sweden", Region.EU, 1567);
	 Team Switzerland = new Team ("Switzerland", Region.EU, 1604);
	 Team Turkey = new Team ("Turkey", Region.EU, 1457);
	 Team Ukraine = new Team ("Ukraine", Region.EU, 1493);
	 Team Wales = new Team ("Wales", Region.EU, 1539);
	 //Africa
	 Team Algeria = new Team ("Algeria", Region.AF, 1348);
	 Team Angola = new Team ("Angola", Region.AF, 1142);
	 Team Benin = new Team ("Benin", Region.AF, 1267);
	 Team Botswana = new Team ("Botswana", Region.AF, 1060);
	 Team Burkina_Faso = new Team ("Burkina Faso", Region.AF, 1380);
	 Team Burundi = new Team ("Burundi", Region.AF, 1089);
	 Team Cameroon = new Team ("Cameroon", Region.AF, 1399);
	 Team Cape_Verde = new Team ("Cape Verde", Region.AF, 1319);
	 Team Central_African_Republic = new Team ("Central African Republic", Region.AF, 1184);
	 Team Chad = new Team ("Chad", Region.AF, 956);
	 Team Comoros = new Team ("Comoros", Region.AF, 1071);
	 Team Congo = new Team ("Congo", Region.AF, 1265);
	 Team Congo_DR = new Team ("Congo DR", Region.AF, 1425);
	 Team Ivory_Coast = new Team ("Côte d'Ivoire", Region.AF, 1365);
	 Team Djibouti = new Team ("Djibouti", Region.AF, 896);
	 Team Egypt = new Team ("Egypt", Region.AF, 1384);
	 Team Equatorial_Guinea = new Team ("Equatorial Guinea", Region.AF, 1074);
	 Team Eritrea = new Team ("Eritrea", Region.AF, 868);
	 Team Eswatini = new Team ("Eswatini", Region.AF, 1074);
	 Team Ethiopia = new Team ("Ethiopia", Region.AF, 1049);
	 Team Gabon = new Team ("Gabon", Region.AF, 1272);
	 Team Gambia = new Team ("Gambia", Region.AF, 994);
	 Team Ghana = new Team ("Ghana", Region.AF, 1423);
	 Team Guinea = new Team ("Guinea", Region.AF, 1350);
	 Team Guinea_Bissau = new Team ("Guinea-Bissau", Region.AF, 1158);
	 Team Kenya = new Team ("Kenya", Region.AF, 1202);
	 Team Lesotho = new Team ("Lesotho", Region.AF, 1075);
	 Team Liberia = new Team ("Liberia", Region.AF, 1044);
	 Team Libya = new Team ("Libya", Region.AF, 1207);
	 Team Madagascar = new Team ("Madagascar", Region.AF, 1203);
	 Team Malawi = new Team ("Malawi", Region.AF, 1122);
	 Team Mali = new Team ("Mali", Region.AF, 1365);
	 Team Mauritania = new Team ("Mauritania", Region.AF, 1210);
	 Team Mauritius = new Team ("Mauritius", Region.AF, 1022);
	 Team Morocco = new Team ("Morocco", Region.AF, 1429);
	 Team Mozambique = new Team ("Mozambique", Region.AF, 1166);
	 Team Namibia = new Team ("Namibia", Region.AF, 1181);
	 Team Niger = new Team ("Niger", Region.AF, 1209);
	 Team Nigeria = new Team ("Nigeria", Region.AF, 1435);
	 //Team Reunion = new Team ("Réunion", Region.AF, 0);
	 Team Rwanda = new Team ("Rwanda", Region.AF, 1088);
	 Team Sao_Principe = new Team ("São Tomé and Príncipe", Region.AF, 920);
	 Team Senegal = new Team ("Senegal", Region.AF, 1515);
	 Team Seychelles = new Team ("Seychelles", Region.AF, 908);
	 Team Sierra_Leone = new Team ("Sierra Leone", Region.AF, 1172);
	 Team Somalia = new Team ("Somalia", Region.AF, 868);
	 Team South_Africa = new Team ("South Africa", Region.AF, 1335);
	 Team South_Sudan = new Team ("South Sudan", Region.AF, 989);
	 Team Sudan = new Team ("Sudan", Region.AF, 1106);
	 Team Tanzania = new Team ("Tanzania", Region.AF, 1105);
	 Team Togo = new Team ("Togo", Region.AF, 1127);
	 Team Tunisia = new Team ("Tunisia", Region.AF, 1491);
	 Team Uganda = new Team ("Uganda", Region.AF, 1302);
	 Team Zambia = new Team ("Zambia", Region.AF, 1302);
	 //Team Zanzibar = new Team ("Zanzibar", Region.AF, 0);
	 Team Zimbabwe = new Team ("Zimbabwe", Region.AF, 1190);
	 //Asia 
	 Team Afghanistan = new Team ("Afghanistan", Region.AS, 1057);
	 Team Australia = new Team ("Australia", Region.AS, 1441);
	 Team Bahrain = new Team ("Bahrain", Region.AS, 1188);
	 Team Bangladesh = new Team ("Bangladesh", Region.AS, 909);
	 Team Bhutan = new Team ("Bhutan", Region.AS, 917);
	 Team Brunei = new Team ("Brunei", Region.AS, 903);
	 Team Cambodia = new Team ("Cambodia", Region.AS, 967);
	 Team China = new Team ("China", Region.AS, 1327);
	 Team Taiwan = new Team ("Taiwan", Region.AS, 1128);
	 Team Guam = new Team ("Guam", Region.AS, 907);
	 Team Hong_Kong = new Team ("Hong Kong", Region.AS, 1078);
	 Team India = new Team ("India", Region.AS, 1219);
	 Team Indonesia = new Team ("Indonesia", Region.AS, 1008);
	 Team Iran = new Team ("Iran", Region.AS, 1516);
	 Team Iraq = new Team ("Iraq", Region.AS, 1319);
	 Team Japan = new Team ("Japan", Region.AS, 1494);
	 Team Jordan = new Team ("Jordan", Region.AS, 1229);
	 Team Korea_DPR = new Team ("Korea DPR", Region.AS, 1152);
	 Team Korea_Republic = new Team ("Korea Republic", Region.AS, 1462);
	 Team Kuwait = new Team ("Kuwait", Region.AS, 1022);
	 Team Kyrgyz = new Team ("Kyrgyz Republic", Region.AS, 1253);
	 Team Laos = new Team ("Laos", Region.AS, 923);
	 Team Lebanon = new Team ("Lebanon", Region.AS, 1277);
	 Team Macau = new Team ("Macau", Region.AS, 925);
	 Team Malaysia = new Team ("Malaysia", Region.AS, 986);
	 Team Maldives = new Team ("Maldives", Region.AS, 1046);
	 Team Mongolia = new Team ("Mongolia", Region.AS, 915);
	 Team Myanmar = new Team ("Myanmar", Region.AS, 1080);
	 Team Nepal = new Team ("Nepal", Region.AS, 996);
	 //Team Northern_Mariana = new Team ("Northern Mariana Islands", Region.AS, 0);
	 Team Oman = new Team ("Oman", Region.AS, 1277);
	 Team Pakistan = new Team ("Pakistan", Region.AS, 888);
	 Team Palestine = new Team ("Palestine", Region.AS, 1224);
	 Team Philippines = new Team ("Philippines", Region.AS, 1135);
	 Team Qatar = new Team ("Qatar", Region.AS, 1398);
	 Team Saudi_Arabia = new Team ("Saudi Arabia", Region.AS, 1342);
	 Team Singapore = new Team ("Singapore", Region.AS, 998);
	 Team Sri_Lanka = new Team ("Sri Lanka", Region.AS, 886);
	 Team Syria = new Team ("Syria", Region.AS, 1286);
	 Team Tajikstan = new Team ("Tajikistan", Region.AS, 1155);
	 Team Thailand = new Team ("Thailand", Region.AS, 1174);
	 Team Timor_Leste = new Team ("Timor-Leste", Region.AS, 900);
	 Team Turkmenistan = new Team ("Turkmenistan", Region.AS, 1089);
	 Team UAE = new Team ("United Arab Emirates", Region.AS, 1360);
	 Team Uzbekistan = new Team ("Uzbekistan", Region.AS, 1279);
	 Team Vietnam = new Team ("Vietnam", Region.AS, 1227);
	 Team Yemen = new Team ("Yemen", Region.AS, 1073);
	 //Oceania 
	 Team American_Samoa = new Team ("American Samoa", Region.OC, 908);
	 Team Cook_Islands =  new Team ("Cook Islands", Region.OC, 908);
	 Team Fiji = new Team ("Fiji", Region.OC, 992);
	 //Team Kirikati = new Team ("Kiribati", Region.OC, 0);
	 Team New_Caledonia = new Team ("New Caledonia", Region.OC, 1026);
	 Team New_Zealand = new Team ("New Zealand", Region.OC, 1157);
	 //Team Niue = new Team ("Niue", Region.OC, 0);
	 Team Papua_New_Guinea = new Team ("Papua New Guinea", Region.OC, 984);
	 Team Samoa = new Team ("Samoa", Region.OC, 896);
	 Team Solomon_Islands = new Team ("Solomon Islands", Region.OC, 1083);
	 Team Tahiti = new Team ("Tahiti", Region.OC, 1020);
	 Team Tonga = new Team ("Tonga", Region.OC, 868);
	 //Team Tuvalu = new Team ("Tuvalu", Region.OC, 0);
	 Team Vanuatu = new Team ("Vanuatu", Region.OC, 991);
	 //CONCACAF
	 Team Anguilla = new Team ("Anguilla", Region.NA, 857);
	 Team Antigua = new Team ("Antigua and Barbuda", Region.NA, 1136);
	 Team Aruba = new Team ("Aruba", Region.NA, 909);
	 Team Bahamas = new Team ("Bahamas", Region.NA, 855);
	 Team Barbados = new Team ("Barbados", Region.NA, 996);
	 Team Belize = new Team ("Belize", Region.NA, 994);
	 Team Bermuda = new Team ("Bermuda", Region.NA, 959);
	 //Team Bonaire = new Team ("Bonaire", Region.NA, 0);
	 Team British_Virgin_Islands = new Team ("British Virgin Islands", Region.NA, 867);
	 Team Canada = new Team ("Canada", Region.NA, 1314);
	 Team Cayman_Islands = new Team ("Cayman Islands", Region.NA, 867);
	 Team Costa_Rica = new Team ("Costa Rica", Region.NA, 1458);
	 Team Cuba = new Team ("Cuba", Region.NA, 961);
	 Team Curacao = new Team ("Curaçao", Region.NA, 1296);
	 Team Dominica = new Team ("Dominica", Region.NA, 954);
	 Team Dominican_Republic = new Team ("Dominican Republic", Region.NA, 1028);
	 Team El_Salvador = new Team ("El Salvador", Region.NA, 1344);
	 //Team French_Guinea = new Team ("French Guiana", Region.NA, 0);
	 Team Grenada = new Team ("Grenada", Region.NA, 973);
	 //Team Guadeloupe = new Team ("Guadeloupe", Region.NA, 0);
	 Team Guatemala = new Team ("Guatemala", Region.NA, 1074);
	 Team Guyana = new Team ("Guyana", Region.NA, 959);
	 Team Haiti = new Team ("Haiti", Region.NA, 1223);
	 Team Honduras = new Team ("Honduras", Region.NA, 1369);
	 Team Jamaica = new Team ("Jamaica", Region.NA, 1391);
	 //Team Martinique = new Team ("Martinique", Region.NA, 0);
	 Team Mexico = new Team ("Mexico", Region.NA, 1549);
	 Team Montserrat = new Team ("Montserrat", Region.NA, 895);
	 Team Nicaragua = new Team ("Nicaragua", Region.NA, 1120);
	 Team Panama = new Team ("Panama", Region.NA, 1327);
	 Team Puerto_Rico = new Team ("Puerto Rico", Region.NA, 940);
	 Team Saint_Kitts = new Team ("Saint Kitts and Nevis", Region.NA, 1096);
	 Team Saint_Lucia = new Team ("Saint Lucia", Region.NA, 975);
	 //Team Saint_Martin = new Team ("Saint Martin", Region.NA, 0);
	 Team Saint_Vincent = new Team ("Saint Vincent + Grenadines", Region.NA, 954);
	 //Team Sint_Maarten = new Team ("Sint Maarten", Region.NA, 0);
	 Team Suriname = new Team ("Suriname", Region.NA, 1045);
	 Team Trinidad_Trinago = new Team ("Trinidad and Tobago", Region.NA, 1258);
	 Team Turks_Caicos = new Team ("Turks and Caicos Islands", Region.NA, 862);
	 Team USA = new Team ("United States", Region.NA, 1506);
	 Team US_Virgin_Islands = new Team ("US Virgin Islands", Region.NA, 888);
	 //CONMEBOL
	 Team Argentina = new Team ("Argentina", Region.SA, 1580);
	 Team Bolivia = new Team ("Bolivia", Region.SA, 1366);
	 Team Brazil = new Team ("Brazil", Region.SA, 1676);
	 Team Chile = new Team ("Chile", Region.SA, 1559);
	 Team Colombia = new Team ("Colombia", Region.SA, 1573);
	 Team Ecuador = new Team ("Ecuador", Region.SA, 1378);
	 Team Paraguay = new Team ("Paraguay", Region.SA, 1467);
	 Team Peru = new Team ("Peru", Region.SA, 1516);
	 Team Uruguay = new Team ("Uruguay", Region.SA, 1613);
	 Team Venezuela = new Team ("Venezuela", Region.SA, 1484);
	 
	 ArrayList <Team> EU2 = new ArrayList<Team>();
	 ArrayList <Team> AF2 = new ArrayList<Team>();
	 ArrayList <Team> AS2 = new ArrayList<Team>();
	 ArrayList <Team> OC2 = new ArrayList<Team>();
	 ArrayList <Team> NA2 = new ArrayList<Team>();
	 ArrayList <Team> SA2 = new ArrayList<Team>();
	 
	 Team [] EU = {Albania, Andorra, Armenia, Austria, Azerbaijan, Belarus, Belgium, Bosnia_Herezgovina,
			 Bulgaria, Croatia, Cyprus, Czech_Republic, Denmark, England, Estonia, Farce_Islands, Finland,
			 France, Georgia, Germany, Gibraltar, Greece, Hungary, Iceland, Israel, Italy, Kazakhstan,
			 Kosovo, Latvia, Liechtenstein, Lithuania, Luxembourg, Malta, Moldova, Montenegro, Netherlands,
			 Macedonia, Northern_Ireland, Norway, Poland, Portugal, Republic_Ireland, Romania, Russia,
			 San_Marino, Scotland, Serbia, Slovakia, Slovenia, Spain, Sweden, Switzerland, Turkey,
			 Ukraine, Wales
	 };
	 Team [] AF = {Algeria, Angola, Benin, Botswana, Burkina_Faso, Burundi, Cameroon, Cape_Verde,
			 Central_African_Republic, Chad, Comoros, Congo, Congo_DR, Ivory_Coast, Djibouti, Egypt, 
			 Equatorial_Guinea, Eritrea, Eswatini, Ethiopia, Gabon, Gambia, Ghana, Guinea, Guinea_Bissau, 
			 Kenya, Lesotho, Liberia, Libya, Madagascar, Malawi, Mali, Mauritania, Mauritius, Morocco, 
			 Mozambique, Namibia, Niger, Nigeria, Rwanda, Sao_Principe, Senegal, Seychelles,
			 Sierra_Leone, Somalia, South_Africa, South_Sudan, Sudan, Tanzania, Togo, Tunisia, Uganda,
			 Zambia, Zimbabwe			 
	 };
	 Team [] AS = {Afghanistan, Australia, Bahrain, Bangladesh, Bhutan, Brunei, Cambodia, China, Taiwan, Guam, 
			 Hong_Kong, India, Indonesia, Iran, Iraq, Japan, Jordan, Korea_DPR, Korea_Republic, Kuwait, Kyrgyz, 
			 Laos, Lebanon, Macau, Malaysia, Maldives, Mongolia, Myanmar, Nepal, Oman, 
			 Pakistan, Palestine, Philippines, Qatar, Saudi_Arabia, Singapore, Sri_Lanka, Syria, Tajikstan, 
			 Thailand, Timor_Leste, Turkmenistan, UAE, Uzbekistan, Vietnam, Yemen			 
	 };
	 Team [] OC = {American_Samoa, Cook_Islands, Fiji, New_Caledonia, New_Zealand,
			 Papua_New_Guinea, Samoa, Solomon_Islands, Tahiti, Tonga, Vanuatu		 
	 };
	 Team [] NA = {Anguilla, Antigua, Aruba, Bahamas, Barbados, Belize, Bermuda,
			 British_Virgin_Islands, Canada, Cayman_Islands, Costa_Rica, Cuba, Curacao, Dominica, 
			 Dominican_Republic, El_Salvador, Grenada, Guatemala, Guyana, Haiti,
			 Honduras, Jamaica, Mexico, Montserrat, Nicaragua, Panama, Puerto_Rico, Saint_Kitts, 
			 Saint_Lucia, Saint_Vincent, Suriname, Trinidad_Trinago, Turks_Caicos, 
			 USA, US_Virgin_Islands			 
	 };
	 Team [] SA = {Argentina, Bolivia, Brazil, Chile, Colombia, Ecuador, Paraguay, Peru, Uruguay, Venezuela
	 };
	 //change for optimal results -- rotations*2 = # of times teams play each other 
	 int rotations = 20;
	 
	 int EU_Spots = 16;
	 int AF_Spots = 9;
	 int AS_Spots = 8;
	 int OC_Spots = 2;
	 int NA_Spots = 7; 
	 int SA_Spots = 6;
	 
	 
	 public WorldCup() {}
	 
	 ArrayList<Team> qualifiers = new ArrayList <Team>();
	 
	 ArrayList<Team> knockout = new ArrayList <Team> ();
	 
	 Team [] GroupA = new Team [3];
	 Team [] GroupB = new Team [3];
	 Team [] GroupC = new Team [3];
	 Team [] GroupD = new Team [3];
	 Team [] GroupE = new Team [3];
	 Team [] GroupF = new Team [3];
	 Team [] GroupG = new Team [3];
	 Team [] GroupH = new Team [3];
	 Team [] GroupI = new Team [3];
	 Team [] GroupJ = new Team [3];
	 Team [] GroupK = new Team [3];
	 Team [] GroupL = new Team [3];
	 Team [] GroupM = new Team [3];
	 Team [] GroupN = new Team [3];
	 Team [] GroupO = new Team [3];
	 Team [] GroupP = new Team [3];
	 
	 public void qualifyEU() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < EU.length; i++) {
				 for (int j = 0; j < EU.length; j++) {
					 if (EU[i] != EU[j]) {
						 EU[i].compete(EU[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(EU);
		 for (int b = 0; b < EU_Spots; b++) {
			 EU2.add(EU[b]);
			 qualifiers.add(EU[b]);
		 }
	 }
	 
	 public void qualifyAF() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < AF.length; i++) {
				 for (int j = 0; j < AF.length; j++) {
					 if (AF[i] != AF[j]) {
						 AF[i].compete(AF[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(AF);
		 for (int b = 0; b < AF_Spots; b++) {
			 AF2.add(AF[b]);
			 qualifiers.add(AF[b]);
		 }
	 }
	 
	 public void qualifyAS() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < AS.length; i++) {
				 for (int j = 0; j < AS.length; j++) {
					 if (AS[i] != AS[j]) {
						 AS[i].compete(AS[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(AS);
		 for (int b = 0; b < AS_Spots; b++) {
			 AS2.add(AS[b]);
			 qualifiers.add(AS[b]);
		 }
	 }
	 
	 public void qualifyOC() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < OC.length; i++) {
				 for (int j = 0; j < OC.length; j++) {
					 if (OC[i] != OC[j]) {
						 OC[i].compete(OC[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(OC);
		 for (int b = 0; b < OC_Spots; b++) {
			 OC2.add(OC[b]);
			 qualifiers.add(OC[b]);
		 }
	 }
	 
	 public void qualifyNA() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < NA.length; i++) {
				 for (int j = 0; j < NA.length; j++) {
					 if (NA[i] != NA[j]) {
						 NA[i].compete(NA[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(NA);
		 for (int b = 0; b < NA_Spots; b++) {
			 NA2.add(NA[b]);
			 qualifiers.add(NA[b]);
		 }
	 }
	 
	 public void qualifySA() {
		 for (int a = 0; a < rotations; a++) {
			 for (int i = 0; i < SA.length; i++) {
				 for (int j = 0; j < SA.length; j++) {
					 if (SA[i] != SA[j]) {
						 SA[i].compete(SA[j]);
					 }
				 }
			 }
		 }
		 Arrays.sort(SA);
		 for (int b = 0; b < SA_Spots; b++) {
			 SA2.add(SA[b]);
			 qualifiers.add(SA[b]);
		 }
	 }
	 
	 public void getGroups() {
		 Collections.shuffle(qualifiers);
		 for (int a = 0; a < 3; a++) {
			 GroupA[a] = qualifiers.get((16*a) + 0);
			 GroupB[a] = qualifiers.get((16*a) + 1);
			 GroupC[a] = qualifiers.get((16*a) + 2);
			 GroupD[a] = qualifiers.get((16*a) + 3);
			 GroupE[a] = qualifiers.get((16*a) + 4);
			 GroupF[a] = qualifiers.get((16*a) + 5);
			 GroupG[a] = qualifiers.get((16*a) + 6);
			 GroupH[a] = qualifiers.get((16*a) + 7);
			 GroupI[a] = qualifiers.get((16*a) + 8);
			 GroupJ[a] = qualifiers.get((16*a) + 9);
			 GroupK[a] = qualifiers.get((16*a) + 10);
			 GroupL[a] = qualifiers.get((16*a) + 11);
			 GroupM[a] = qualifiers.get((16*a) + 12);
			 GroupN[a] = qualifiers.get((16*a) + 13);
			 GroupO[a] = qualifiers.get((16*a) + 14);
			 GroupP[a] = qualifiers.get((16*a) + 15);
		 }
	 }
	 
	 public void printGroups() {
		Team [][] cup = new Team [16][3];
		cup[0] = GroupA;
		cup[1] = GroupB;
		cup[2] = GroupC;
		cup[3] = GroupD;
		cup[4] = GroupE;
		cup[5] = GroupF;
		cup[6] = GroupG;
		cup[7] = GroupH;
		cup[8] = GroupI;
		cup[9] = GroupJ;
		cup[10] = GroupK;
		cup[11] = GroupL;
		cup[12] = GroupM;
		cup[13] = GroupN;
		cup[14] = GroupO;
		cup[15] = GroupP;
		for (int length = 0; length < 16; length++) {
			Arrays.sort(cup[length]);
		}
		System.out.println("     Group A                        Group B                       Group C"
				+ "                       Group D");
		for (int i1 = 0; i1 < 3; i1++) {
			for (int j1 = 0; j1 < 4; j1++) {
				String temp1 = (cup[j1][i1].name + ": " + cup[j1][i1].points);
				//": " + cup[j1][i1].points
				for (int k1 = temp1.length(); k1 < 30; k1++) {
					temp1 = temp1 + " ";
				}
				System.out.print(temp1);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("     Group E                        Group F                       Group G"
				+ "                       Group H");
		for (int i2 = 0; i2 < 3; i2++) {
			for (int j2 = 4; j2 < 8; j2++) {
				String temp2 = (cup[j2][i2].name + ": " + cup[j2][i2].points);
				//": " + cup[j1][i1].points
				for (int k2 = temp2.length(); k2 < 30; k2++) {
					temp2 = temp2 + " ";
				}
				System.out.print(temp2);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("     Group I                        Group J                       Group K"
				+ "                       Group L");
		for (int i3 = 0; i3 < 3; i3++) {
			for (int j3 = 8; j3 < 12; j3++) {
				String temp3 = (cup[j3][i3].name + ": " + cup[j3][i3].points);
				//": " + cup[j1][i1].points
				for (int k3 = temp3.length(); k3 < 30; k3++) {
					temp3 = temp3 + " ";
				}
				System.out.print(temp3);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("     Group M                        Group N                       Group O"
				+ "                       Group P");
		for (int i4 = 0; i4 < 3; i4++) {
			for (int j4 = 12; j4 < 16; j4++) {
				String temp4 = (cup[j4][i4].name + ": " + cup[j4][i4].points);
				//": " + cup[j1][i1].points
				for (int k4 = temp4.length(); k4 < 30; k4++) {
					temp4 = temp4 + " ";
				}
				System.out.print(temp4);
			}
			System.out.println();
		}
		
	 }
	 
	 public void runGroupStages() {
		 Team [][] cup = new Team [16][3];
		 cup[0] = GroupA;
		 cup[1] = GroupB;
		 cup[2] = GroupC;
		 cup[3] = GroupD;
		 cup[4] = GroupE;
		 cup[5] = GroupF;
		 cup[6] = GroupG;
		 cup[7] = GroupH;
		 cup[8] = GroupI;
		 cup[9] = GroupJ;
		 cup[10] = GroupK;
	   	 cup[11] = GroupL;
		 cup[12] = GroupM;
		 cup[13] = GroupN;
		 cup[14] = GroupO;
		 cup[15] = GroupP;
		 for (int i = 0; i < cup.length; i++) {
			 for (int j = 0; j < cup[0].length; j++) {
				 cup[i][j].setPoints();
			 }
		 }
		 for (int a = 0; a < cup.length; a++) {
			 cup[a][0].compete(cup[a][1]);
			 cup[a][0].compete(cup[a][2]);
			 cup[a][1].compete(cup[a][2]);
		 }
		 printGroups();
	 }
	 
	 public void getKnockouts() {
		 knockout.add(GroupA[0]);
		 knockout.add(GroupB[1]);
		 knockout.add(GroupC[0]);
		 knockout.add(GroupD[1]);
		 knockout.add(GroupE[0]);
		 knockout.add(GroupF[1]);
		 knockout.add(GroupG[0]);
		 knockout.add(GroupH[1]);
		 knockout.add(GroupI[0]);
		 knockout.add(GroupJ[1]);
		 knockout.add(GroupK[0]);
		 knockout.add(GroupL[1]);
		 knockout.add(GroupM[0]);
		 knockout.add(GroupN[1]);
		 knockout.add(GroupO[0]);
		 knockout.add(GroupP[1]);
		 knockout.add(GroupA[1]);
		 knockout.add(GroupB[0]);
		 knockout.add(GroupC[1]);
		 knockout.add(GroupD[0]);
		 knockout.add(GroupE[1]);
		 knockout.add(GroupF[0]);
		 knockout.add(GroupG[1]);
		 knockout.add(GroupH[0]);
		 knockout.add(GroupI[1]);
		 knockout.add(GroupJ[0]);
		 knockout.add(GroupK[1]);
		 knockout.add(GroupL[0]);
		 knockout.add(GroupM[1]);
		 knockout.add(GroupN[0]);
		 knockout.add(GroupO[1]);
		 knockout.add(GroupP[0]);
	 }
	 
	 public void round32() {
		 System.out.println();
		 System.out.println("Round of 32");
		 System.out.println();
		 for (int games = 0; games < 16; games++) {
			 if (knockout.get(games).postCompete(knockout.get(games+1))) {
				 System.out.println(knockout.get(games).name + " eliminates " + knockout.get(games+1).name);
				 knockout.remove(games+1);
			 }
			 else {
				 System.out.println(knockout.get(games+1).name + " eliminates " + knockout.get(games).name);
				 knockout.remove(games);
			 }
		 }
	 }
	 
	 public void round16() {
		 System.out.println();
		 System.out.println("Round of 16");
		 System.out.println();
		 for (int games = 0; games < 8; games++) {
			 if (knockout.get(games).postCompete(knockout.get(games+1))) {
				 System.out.println(knockout.get(games).name + " eliminates " + knockout.get(games+1).name);
				 knockout.remove(games+1);
			 }
			 else {
				 System.out.println(knockout.get(games+1).name + " eliminates " + knockout.get(games).name);
				 knockout.remove(games);
			 }
		 }
	 }
	 
	 public void quarters() {
		 System.out.println();
		 System.out.println("Quarter-Finals");
		 System.out.println();
		 for (int games = 0; games < 4; games++) {
			 if (knockout.get(games).postCompete(knockout.get(games+1))) {
				 System.out.println(knockout.get(games).name + " eliminates " + knockout.get(games+1).name);
				 knockout.remove(games+1);
			 }
			 else {
				 System.out.println(knockout.get(games+1).name + " eliminates " + knockout.get(games).name);
				 knockout.remove(games);
			 }
		 }
	 }
	 
	 public void semis() {
		 System.out.println();
		 System.out.println("Semi-Finals");
		 System.out.println();
		 for (int games = 0; games < 2; games++) {
			 if (knockout.get(games).postCompete(knockout.get(games+1))) {
				 System.out.println(knockout.get(games).name + " eliminates " + knockout.get(games+1).name);
				 knockout.remove(games+1);
			 }
			 else {
				 System.out.println(knockout.get(games+1).name + " eliminates " + knockout.get(games).name);
				 knockout.remove(games);
			 }
		 }
	 }
	 
	 public void consolation() {
		 
	 }
	  
	 public void finalGame() {
		 System.out.println();
		 System.out.println("World Cup Final");
		 System.out.println();
		 for (int games = 0; games < 1; games++) {
			 if (knockout.get(games).postCompete(knockout.get(games+1))) {
				 System.out.println(knockout.get(games).name + " wins the World Cup!");
			 }
			 else {
				 System.out.println(knockout.get(games+1).name + " wins the World Cup!");
			 }
		 }
	 }
	 
	 public void getWorldCup() {
		 qualifyEU();
		 qualifyAF();
		 qualifyAS();
		 qualifyOC();
		 qualifyNA();
		 qualifySA();
		 getGroups();
		 //printGroups();
	 }
	 
	 public void runWorldCup() {
		 runGroupStages();
		 getKnockouts();
		 round32();
		 round16();
		 quarters();
		 semis();
		 finalGame();		 
	 }
	 
}
