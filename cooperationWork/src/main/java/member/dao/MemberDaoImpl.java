package member.dao;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//ȸ������
	@Override
	public void register(MemberVO vo) throws Exception{
		sqlSessionTemplate.insert("register", vo);
	}
	
	//�α���
	@Override
	public MemberVO login(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("login", vo);
	}
	
	//����
	@Override
	public void memberUpdate(MemberVO vo) throws Exception{
		sqlSessionTemplate.update("memberUpdate", vo);
	}
	
	//����
	@Override
	public void memberDelete(MemberVO vo) throws Exception{
		sqlSessionTemplate.delete("memberDelete", vo);
	}
	
	//���̵� �ߺ� üũ
	public int idChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("idChk", vo);
		return result;
	}
	
	//�̸��� �ߺ� üũ
	public int emailChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("emailChk", vo);
		return result;
	}
	
	//��� üũ
	@Override
	public int pwChk(MemberVO vo) throws Exception{
		int result = sqlSessionTemplate.selectOne("pwChk", vo);
		return result;
	}
	
	//���̵� ã��
	@Override
	public MemberVO findId(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("findId", vo);
	}
	
	//��� ã��
	@Override
	public MemberVO finePw(MemberVO vo) throws Exception{
		return sqlSessionTemplate.selectOne("findPw", vo);
	}
}
