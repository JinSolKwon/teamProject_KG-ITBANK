package member.service;


import member.domain.MemberVO;

public interface MemberService {
	//ȸ������
	public void register(MemberVO vo) throws Exception;
	
	//�α���
	public MemberVO login(MemberVO vo) throws Exception;
	
	//���� ����
	public void memberUpdate(MemberVO vo) throws Exception;
	
	//ȸ�� Ż��
	public void memberDelete(MemberVO vo) throws Exception;
	
	//���̵� �ߺ� üũ
	public int idChk(MemberVO vo) throws Exception;
	
	//�����ȣ �ߺ� üũ
	public int emailChk(MemberVO vo) throws Exception;
	
	//��� üũ
	public int pwChk(MemberVO vo) throws Exception;
	
	//���̵� ã��
	public MemberVO findId(MemberVO vo) throws Exception;
	
	//��� ã��
	public MemberVO findPw(MemberVO vo) throws Exception;
} 
