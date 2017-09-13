package com.miitgxt.common.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

/**
 * @author Gao ZhongJie
 */
public class IPAwareDaoAuthenticationProvider extends DaoAuthenticationProvider {

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
            UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        super.additionalAuthenticationChecks(userDetails, authentication);

        ((GxtSessionUser) userDetails)
            .setIp(((WebAuthenticationDetails) authentication.getDetails())
                .getRemoteAddress());
    }
}
