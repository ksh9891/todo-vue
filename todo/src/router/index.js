import VueRouter from "vue-router";
import Login from "../components/Login";
import Home from "../components/Home";

export default new VueRouter({
    mode: 'history',
    routes: [
        { path: '/', component: Home },
        { path: '/login', component: Login },
        { path: '/logout', component: { template: '<div>Logout</div>' } },
        { path: '/posts', component: { template: '<div>Posts</div>' } },
        { path: '/posts/new', component: { template: '<div>Post New</div>' } },
        { path: '/posts/detail', component: { template: '<div>Post Detail</div>' } },
        { path: '*', component: { template: '<div>Not Found</div>' } },
    ]
});