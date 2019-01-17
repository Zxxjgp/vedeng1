package com.vedeng.message.demo.realm;

import com.vedeng.message.demo.common.constant.CodeConstants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 *
 * @author zhaodong
 * @version v1.0
 * @email zhaodongxx@outlook.com
 * @since 2018/3/30 22:55
 */
public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger log = LoggerFactory.getLogger(MyShiroRealm.class);

/*    @Resource
    public UserService userService;*/

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
   //     User user = (User)SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        return authorizationInfo;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //获取用户账号
        String username = upToken.getUsername();

     //   User user = null;
        try {
        //    user = userService.selectUserByLoginName(username);
          //  if (user  == null){
          //      throw  new AuthException("当前用户不存在", CodeConstants.FIND_EXCEPTION);
         //   }
        }
        catch (Exception e)
        {
            log.info("对用户[" + username + "]进行登录验证..验证未通过{}", e.getMessage());
          //  throw new AuthException("对用户[" + username + "]进行登录验证..验证未通过{},不存在", CodeConstants.FIND_EXCEPTION);
        }
/*        if (user != null) {
            ByteSource credentialsSalt = ByteSource.Util.bytes(username);
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username,user.getPassword(), credentialsSalt, getName());

            return authenticationInfo;
        }*/

        return null;
    }
    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        Object credentials = "123456";
        ByteSource credentialsSalt = ByteSource.Util.bytes("admin");
        int hashIterations = 1024;

        Object result = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(result);
    }

    public static String  getPassword(String password , String username) {
        String hashAlgorithmName = "MD5";
        Object credentials = password;
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        int hashIterations = 1024;

        Object result = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(result);

        return result.toString();
    }

    /**
     * 清理缓存权限
     */
    public void clearCachedAuthorizationInfo()
    {
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}