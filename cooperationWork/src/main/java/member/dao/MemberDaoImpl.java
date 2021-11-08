package member.dao;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception{
		sqlSessionTemplate.insert("register", vo);
	}
	
	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("login", vo);
	}
	
	//수정
	@Override
	public void memberUpdate(MemberVO vo) throws Exception{
		sqlSessionTemplate.update("memberUpdate", vo);
	}
	
	//삭제
	@Override
	public void memberDelete(MemberVO vo) throws Exception{
		sqlSessionTemplate.delete("memberDelete", vo);
	}
	
	//아이디 중복 체크
	public int idChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("idChk", vo);
		return result;
	}
	
	//이메일 중복 체크
	public int emailChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("emailChk", vo);
		return result;
	}
	
	//비번 체크
	@Override
	public int pwChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("pwChk", vo);
		return result;
	}
	
	//아이디 찾기
	@Override
	public MemberVO findId(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("findId", vo);
	}
	
	//비번 찾기
	@Override
	public MemberVO finePw(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("findPw", vo);
	}
}
