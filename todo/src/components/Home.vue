<template>
    <v-card
            class="mx-auto px-5 py-5"
            width="1000px"
    >
        <v-card-title>TodoList</v-card-title>

        <v-divider />

        <v-card-subtitle>
            <v-input>
                <v-text-field>
                    <v-icon slot="append" color="red">add</v-icon>
                </v-text-field>
            </v-input>
        </v-card-subtitle>

        <v-card-text>
            <div v-for="n in 10" v-bind:key=n class="my-3 py-3">
                <h2>TodoList {{ n }}</h2><br>
                <v-divider />
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