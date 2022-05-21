package stringg;

public class Stringmethod {
	   
	public static void main(String[] args) {
		String v="v6ishalbhau";
		char ashu=v.charAt(1);
		System.out.println(ashu);
		
		String a="ashu@@";
		String avi="avinash";
		String c=a.concat(avi);
		System.out.println(c);
		
		
		String k="kishordada";
		String ko="kishordada";
		boolean d=k.equals(ko);
		System.out.println(d);
		

		String kiss="kishordada";
		String kom="kISHOrdaDa";
		boolean dada=kiss.equalsIgnoreCase(kom);
		System.out.println(dada);
		
		String ru="rupeshinmock";
		String cc=ru.substring(0,6);
		String ca=ru.substring(6);
		System.out.println(cc);
		System.out.println(ca);
		
		String pur="purwal   77777";
		int pu=pur.length();
		System.out.println(pu);
		
		String ashuu="chabrabhau";
		 String kaju=ashuu.replace("bhau","adhoc");
		 String kajuu=ashuu.replace('c','g');
		 
			System.out.println(kaju);
				
			System.out.println(kajuu);
			
			String shiv="shivambhau";
			String shiba=shiv.toUpperCase();
			System.out.println(shiba);
			
			String sh="SHUBHAM";
			String shibainu=sh.toLowerCase();
			System.out.println(shibainu);
			
			String shubh="  bhai  bhai  ";
			String kkr=shubh.trim();
			System.out.println(kkr);
			
			String mum="mumbaiindians";
			int mi=mum.indexOf('i');
			System.out.println(mi);
			
			
			String pun="punjabkingspun";
					int puu=pun.lastIndexOf('u');
					System.out.println(puu);
					
			String csk="prityzinta";
					boolean csk1=csk.contains("zinta");
					System.out.println(csk1);
					
					String dhonii="ipl2022";
					System.out.println(dhonii +"csk");
					char[] shakshi=dhonii.toCharArray();
					for(int z=0;z<shakshi.length;z++)
					System.out.println(shakshi[z]);
					
					String sachin="pokemon512";
					char anjali=sachin.charAt(8);
					System.out.println(Character.isDigit(anjali));
					
					String se="purwal bhauuu nagupkar";
					String[] ess=se.split("\\s");
					for(String m:ess)
					System.out.println(m);
					
					String ga="";
					boolean ba=ga.isBlank();
					System.out.println(ba);
					
				
	}

}
