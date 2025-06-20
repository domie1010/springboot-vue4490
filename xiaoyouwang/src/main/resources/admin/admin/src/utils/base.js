const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyouwang/",
            name: "xiaoyouwang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyouwang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "计算机学院校友网"
        } 
    }
}
export default base
