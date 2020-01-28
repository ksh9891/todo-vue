<template>
    <v-app>
        <v-content app>
            <v-container fluid style="height: 100%">
                <v-row style="height: 100%">
                    <v-col cols="12" class="my-auto">
                        <router-view></router-view>
                    </v-col>
                </v-row>
            </v-container>
        </v-content>
    </v-app>
</template>

<script>
    export default {
        name: 'App',
    };
</script>