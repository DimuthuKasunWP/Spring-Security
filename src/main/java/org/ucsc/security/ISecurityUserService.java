package org.ucsc.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
