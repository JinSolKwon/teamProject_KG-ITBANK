package member.service;


import member.domain.MemberVO;

public interface MemberService {
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//정보 수정
	public void memberUpdate(MemberVO vo) throws Exception;
	
	//회원 탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
	
	//아이디 중복 체크
	public int idChk(MemberVO vo) throws Exception;
	
	//비빌번호 중복 체크
	public int emailChk(MemberVO vo) throws Exception;
	
	//비번 체크
	public int pwChk(MemberVO vo) throws Exception;
	
	//아이디 찾기
	public MemberVO findId(MemberVO vo) throws Exception;
	
	//비번 찾기
	public MemberVO findPw(MemberVO vo) throws Exception;
} 
