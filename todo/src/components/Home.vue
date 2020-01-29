<template>
    <v-card
            class="mx-auto px-5 py-5"
            width="1000px"
    >
        <v-img
                class="white--text align-end"
                height="200px"
                src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
        >
            <v-card-title class="white--text">
                <span class="headline">TodoList</span>
                <v-spacer />
                <v-menu bottom left>
                    <template v-slot:activator="{ on }">
                        <v-btn
                                dark
                                icon
                                v-on="on"
                        >
                            <v-icon>mdi-dots-vertical</v-icon>
                        </v-btn>
                    </template>

                    <v-list>
                        <v-list-item>
                            <v-list-item-title>김상현</v-list-item-title>
                        </v-list-item>
                        <v-list-item>
                            <v-list-item-title>
                                <router-link to="/login">로그인</router-link>
                            </v-list-item-title>
                        </v-list-item>
                        <v-list-item>
                            <v-list-item-title>
                                <router-link to="/logout">로그아웃</router-link>
                            </v-list-item-title>
                        </v-list-item>
                    </v-list>
                </v-menu>
            </v-card-title>
        </v-img>

        <!-- 후에 컴포넌트 분리 -->
        <v-card-subtitle>
            <v-input>
                <v-text-field>
                    <v-btn text icon color="indigo" slot="append" type="submit">
                        <v-icon>add</v-icon>
                    </v-btn>
                </v-text-field>
            </v-input>
        </v-card-subtitle>

        <!-- 후에 컴포넌트 분리 -->
        <v-card-text>
            <h1>리스트</h1>

            <v-divider class="my-10" />

            <!-- 여기는 백엔드에서 데이터를 받아와야 한다.  -->
            <div v-for="n in 10" v-bind:key=n class="my-3 py-3 flex-row">
                <div class="d-flex">
                    <div class="my-auto">
                        <v-checkbox>asd</v-checkbox>
                    </div>
                    <div class="mr-auto my-auto">
                        <h3>TodoList dwjja sksdk wqsjs cnmdkw askdkw kd1j xcnqa de itie {{ n }}</h3>
                    </div>
                    <div class="ml-auto">
                        <v-btn text icon color="blue">
                            <v-icon>edit</v-icon>
                        </v-btn>
                        <v-btn text icon color="red">
                            <v-icon>delete</v-icon>
                        </v-btn>
                    </div>
                </div>
                <v-divider class="my-3" />
            </div>
        </v-card-text>
    </v-card>
</template>

<script>
    export default {
        name: "Home.vue"
    }
</script>

<style scoped>

</style>