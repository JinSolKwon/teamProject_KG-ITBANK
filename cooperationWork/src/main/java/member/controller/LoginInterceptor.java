package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import member.domain.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	// preHandle() : ��Ʈ�ѷ����� ���� ����Ǵ� �޼���
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // session ��ü�� ������
        HttpSession session = request.getSession();
        // loginó���� ����ϴ� ����� ������ ��� �ִ� ��ü�� ������
        MemberVO member = (MemberVO)session.getAttribute("member");
         
        if ( member ==null ){
            // �α����� �ȵǾ� �ִ� ���������� �α��� ������ �ٽ� ��������(redirect)
            response.sendRedirect("/");
            return false; // ���̻� ��Ʈ�ѷ� ��û���� ���� �ʵ���false�� ��ȯ��
        }
         
        // preHandle��return�� ��Ʈ�ѷ� ��û uri�� ���� �ǳ� �ȵǳĸ� �㰡�ϴ� �ǹ���
        // ����true���ϸ� ��Ʈ�ѷ� uri�� ���� ��.
        return true;
    }
 
    // ��Ʈ�ѷ��� ����ǰ� ȭ���� �������� ������ ����Ǵ� �޼���
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        super.postHandle(request, response, handler, modelAndView);
    }
}
