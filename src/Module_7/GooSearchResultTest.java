package Module_7;

public class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
class GooSearchResult{
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        int begin = getUrl().indexOf("://");
        String result = getUrl().substring(begin + 3);

        int end = result.indexOf("/");
        if(end == -1){
            return result;
        }
        return result.substring(0,end);
    }
}
