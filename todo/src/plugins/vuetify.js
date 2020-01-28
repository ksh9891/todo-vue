import 'material-design-icons-iconfont/dist/material-design-icons.css' // Ensure you are using css-loader
import Vue from 'vue'
import Vuetify from 'vuetify/lib'
import VueRouter from 'vue-router'

Vue.use(Vuetify);
Vue.use(VueRouter);

export default new Vuetify({
    icons: {
        iconfont: 'md',
    },
})