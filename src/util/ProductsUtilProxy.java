package util;

public class ProductsUtilProxy implements util.ProductsUtil {
  private String _endpoint = null;
  private util.ProductsUtil productsUtil = null;
  
  public ProductsUtilProxy() {
    _initProductsUtilProxy();
  }
  
  public ProductsUtilProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsUtilProxy();
  }
  
  private void _initProductsUtilProxy() {
    try {
      productsUtil = (new util.ProductsUtilServiceLocator()).getProductsUtil();
      if (productsUtil != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productsUtil)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productsUtil)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productsUtil != null)
      ((javax.xml.rpc.Stub)productsUtil)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public util.ProductsUtil getProductsUtil() {
    if (productsUtil == null)
      _initProductsUtilProxy();
    return productsUtil;
  }
  
  public java.lang.String[] categories() throws java.rmi.RemoteException{
    if (productsUtil == null)
      _initProductsUtilProxy();
    return productsUtil.categories();
  }
  
  public boolean insertBoard(java.lang.String name, java.lang.String description, java.lang.String categories) throws java.rmi.RemoteException{
    if (productsUtil == null)
      _initProductsUtilProxy();
    return productsUtil.insertBoard(name, description, categories);
  }
  
  
}