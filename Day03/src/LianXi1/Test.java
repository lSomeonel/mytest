package LianXi1;

public class Test {

	public static void fountion(studyType s){
		s.study();
		s.work();
		LanQiustud L=(LanQiustud)s;
		L.studyEnglish();
	}
	public static void fountion2(StudyEnglish se){
		se.studyEnglish();
		LanQiuTeach Lt=(LanQiuTeach)se;
		Lt.teach();
		Lt.work();
	}
	
	public static void main(String[] args) {
		/*
		 * 1.��ͨ��Ķ�̬
		 */
		studyType sp=new PinPangstud();
		sp.study();
		sp.work();
		PinPangstud sp1=(PinPangstud)sp;
		sp1.studyEnglish();
		System.out.println("---------------------------------------------");

		/*
		 * 2.��̬--����Ϊ�������β�
		 */
		fountion(new LanQiustud());
		System.out.println("---------------------------------------------");

		/*
		 * 3.��ͨ�ӿڵĶ�̬
		 */
		StudyEnglish pe=new PingPangTeach();
		pe.studyEnglish();
		PingPangTeach pt=(PingPangTeach)pe;
		pt.work();
		pt.teach();
		System.out.println("---------------------------------------------");
		/*
		 * 4.��̬--�ӿ���Ϊ�������β�
		 */
		fountion2(new LanQiuTeach());
		
		
		
	}

}
