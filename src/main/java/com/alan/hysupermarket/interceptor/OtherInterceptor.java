package com.alan.hysupermarket.interceptor;

import com.alan.hysupermarket.pojo.Category;
import com.alan.hysupermarket.pojo.OrdersItem;
import com.alan.hysupermarket.pojo.Users;
import com.alan.hysupermarket.service.ICategoryService;
import com.alan.hysupermarket.service.IOrdersItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 拦截器
 */
public class OtherInterceptor extends HandlerInterceptorAdapter {


    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IOrdersItemService ordersItemService;

    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     * 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
     * 如果返回true
     * 执行下一个拦截器,直到所有的拦截器都执行完毕
     * 再执行被拦截的Controller
     * 然后进入拦截器链,
     * 从最后一个拦截器往回执行所有的postHandle()
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()
     */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    /**
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
     * 可在modelAndView中加入数据，比如当前时间
     */
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        /*这里是获取分类集合信息，用于放在搜索栏下面*/
        List<Category> cs = categoryService.list();
        request.getSession().setAttribute("cs", cs);
        /* 点击logo返回首页 */
        /*这里是获取当前的contextPath:tmall_ssm,用与放在左上角那个变形金刚，点击之后才能够跳转到首页，否则点击之后也仅仅停留在当前页面*/
        HttpSession session = request.getSession();
        String contextPath = session.getServletContext().getContextPath();
        request.getSession().setAttribute("contextPath", contextPath);

        /*这里是获取购物车中一共有多少数量*/
        Users user = (Users) session.getAttribute("user");
        int cartTotalItemNumber = 0;
        // 判断用户是否登录
        if (null != user) {
            List<OrdersItem> ois = ordersItemService.listByUser(user.getID());
            for (OrdersItem oi : ois) {
                // 获取购物车中的数量
                cartTotalItemNumber += oi.getQUANTITY();
            }

        }
        request.getSession().setAttribute("cartTotalItemNumber", cartTotalItemNumber);

    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     * <p>
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     */
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

//        System.out.println("afterCompletion(), 在访问视图之后被调用");
    }


}
