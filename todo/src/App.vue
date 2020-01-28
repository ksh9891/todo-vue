<template>
    <v-app>
        <v-content app>
            <v-container fluid style="height: 100%">
                <p>
                    <router-link to="/" exact>Home</router-link>
                    <router-link to="/login">Login</router-link>
                    <router-link to="/logout" exact>Logout</router-link>
                    <router-link to="/posts">Posts</router-link>
                    <router-link to="/posts/new" exact>New Post</router-link>
                    <router-link to="/posts/detail" exact>Detail Post</router-link>
                </p>

                <v-row style="height: 100%">
                    <v-col cols="12" class="my-auto">
                        <router-view></router-view>
                    </v-col>
                </v-row>
            </v-container>
        </v-content>

        <v-footer
                app
                class="font-weight-medium"
        >
            <v-col
                    class="text-center"
                    cols="12"
            >
                {{ new Date().getFullYear() }} — <strong>Vuetify</strong>
            </v-col>
        </v-footer>
    </v-app>
</template>

<script>
    export default {
        name: 'App',

        data: () => ({
            drawer: null,
            menu: [
                { title: 'Home', icon: 'dashboard' },
                { title: '로그인', icon: 'question_answer' },
            ],
        }),
    };
</script>