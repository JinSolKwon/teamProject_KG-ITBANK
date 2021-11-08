package member.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import member.dao.MemberDao;
import member.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	

	@Autowired
	MemberDao memberDao;
	
	//ȸ������
	@Override
	public void register(MemberVO vo) throws Exception{
		memberDao.register(vo);
	}
	//�α���
	@Override
	public MemberVO login(MemberVO vo) throws Exception{
		return memberDao.login(vo);
	}
	//���� ����
	@Override
	public void memberUpdate(MemberVO vo) throws Exception{
		memberDao.memberUpdate(vo);
	}
	//ȸ�� Ż��
	@Override
	public void memberDelete(MemberVO vo) throws Exception{
		memberDao.memberDelete(vo);
	}
	//���̵� �ߺ� üũ
	@Override
	public int idChk(MemberVO vo) throws Exception{
		int result = memberDao.idChk(vo);
		return result;
	}
	
	@Override
	public int emailChk(MemberVO vo) throws Exception{
		int result = memberDao.emailChk(vo);
		return result;
	}
	
	//��� üũ
	@Override
	public int pwChk(MemberVO vo) throws Exception{
		int result = memberDao.pwChk(vo);
		return result;
	}
	//���̵� ã��
	@Override 
	public MemberVO findId(MemberVO vo) throws Exception{
		return memberDao.findId(vo);
	}
	//��� ã��
	@Override
	public MemberVO findPw(MemberVO vo) throws Exception{
		return memberDao.finePw(vo);
	}

}
