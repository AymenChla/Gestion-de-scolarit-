
package com.GPEA.dao;


public interface MessageDao {
    
    public void envoyerMsgProfToAdmin(Long idCompteSource,String msg,String objetMsg);
    public void envoyerMsgEtudToAdmin(Long idCompteSource,String msg,String objetMsg);    
    
}
