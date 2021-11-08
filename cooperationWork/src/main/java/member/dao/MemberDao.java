package member.dao;

import member.domain.MemberVO;

public interface MemberDao {
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//정보 수정
	public void memberUpdate(MemberVO vo) throws Exception;
	
	//회원 탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
	
	//아이디 중복체크
	public int idChk(MemberVO vo) throws Exception;
	
	//이메일 중복체크
	public int emailChk(MemberVO vo) throws Exception;
	
	//비밀번호 체크
	public int pwChk(MemberVO vo) throws Exception;
	
	//아이디 찾기
	public MemberVO findId(MemberVO vo) throws Exception;
	
	//비번 찾기
	public MemberVO finePw(MemberVO vo) throws Exception;
	
}
